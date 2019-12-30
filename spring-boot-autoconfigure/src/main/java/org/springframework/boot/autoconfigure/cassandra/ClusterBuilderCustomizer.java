/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.autoconfigure.cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Cluster.Builder;

/**
 * Callback interface that can be implemented by beans wishing to customize the
 * {@link Cluster} via a {@link Builder Cluster.Builder} whilst retaining default
 * auto-configuration.
 *
 * @author Eddú Meléndez
 * @since 1.5.0
 */
public interface ClusterBuilderCustomizer {

	/**
	 * Customize the {@link Builder}.
	 *
	 * @param clusterBuilder the builder to customize
	 */
	void customize(Builder clusterBuilder);

}
