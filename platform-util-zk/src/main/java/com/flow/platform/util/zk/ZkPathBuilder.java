/*
 * Copyright 2017 flow.ci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flow.platform.util.zk;

/**
 * <p>
 * To create path by root/append/agent
 * </p>
 *
 * @author gy@fir.im
 */
public class ZkPathBuilder {

    private StringBuilder path = new StringBuilder();

    private ZkPathBuilder(String root) {
        this.path.append("/").append(root);
    }

    public ZkPathBuilder append(String node) {
        this.path.append("/").append(node);
        return this;
    }

    public String path() {
        return path.toString();
    }

    public static ZkPathBuilder create(String root) {
        return new ZkPathBuilder(root);
    }
}
