/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dia.utils

import org.scalatest.{BeforeAndAfter, FunSuite}

import org.dia.core.SciSparkContext
import org.dia.testenv.SparkTestConstants

/**
 * Tests for WWLLNUtils
 */
class WWLLNUtilsTest extends FunSuite with BeforeAndAfter {
  val sc = SparkTestConstants.sc
  /**
   * Read data into DF
   */
  test("readWWLLNDataTest") {
    val WWLLNpath = "resources/WWLLN/"
    val partitions = 4
    val WWLLNdata = sc.readWWLLNData(WWLLNpath, partitions)
    val line1 = WWLLNdata.value.take(1).mkString("")
    assert(line1 == "[2006/09/11 00:00:00,-6.0588,-178.601,28.2,5]")
  }
}
