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

package org.apache.flink.graph.example.utils;

public class PageRankData {
	
	public static final String EDGES = "2	1\n" +
										"5	2\n" + 
										"5	4\n" +
										"4	3\n" +
										"4	2\n" +
										"1	4\n" +
										"1	2\n" +
										"1	3\n" +
										"3	5\n";

	
	public static final String RANKS_AFTER_3_ITERATIONS = "1	0.237\n" +
														"2	0.248\n" + 
														"3	0.173\n" +
														"4	0.175\n" +
														"5	0.165\n";

	private PageRankData() {}
}

