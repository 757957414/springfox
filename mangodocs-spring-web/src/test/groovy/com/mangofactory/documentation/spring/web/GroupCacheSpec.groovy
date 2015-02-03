package com.mangofactory.documentation.spring.web

import com.mangofactory.documentation.builder.GroupBuilder
import spock.lang.Specification

class GroupCacheSpec extends Specification {
  def "Behaves like a map" () {
    given:
      def sut = new GroupCache()
    and:
      sut.addGroup(new GroupBuilder().name("test").build())

    when:
      def group = sut.getGroup("test")
    then:
      group != null
      group.groupName == "test"
    and:
      sut.getGroup("non-existent") == null

  }
}