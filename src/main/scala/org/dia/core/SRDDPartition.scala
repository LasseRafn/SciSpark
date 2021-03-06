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
package org.dia.core

import org.apache.spark.Partition

/**
 * The SRDD partition used by SRDD. Each SRDDPartition
 * contains a subset of the entire URI list.
 */
class SRDDPartition[T](val index: Int, val uriList: List[String]) extends Partition {

  /**
   * To string method
   * @return String
   */
  override def toString : String = {
    val sb = new StringBuilder
    sb.append("{idx:").append(index).append(",")
    sb.append("uris:").append(uriList).append("}")
    sb.toString()
  }

}
