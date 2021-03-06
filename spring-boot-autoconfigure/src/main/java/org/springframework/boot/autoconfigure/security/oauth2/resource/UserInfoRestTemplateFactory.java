/*
 * Copyright 2012-2017 the original author or authors.
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

package org.springframework.boot.autoconfigure.security.oauth2.resource;

import org.springframework.security.oauth2.client.OAuth2RestTemplate;

/**
 * Factory used to create the {@link OAuth2RestTemplate} used for extracting user info
 * during authentication if none is available.
 *
 * @author Dave Syer
 * @author Stephane Nicoll
 * @since 1.4.0
 */
public interface UserInfoRestTemplateFactory {

	/**
	 * Return the {@link OAuth2RestTemplate} used for extracting user info during
	 * authentication if none is available.
	 *
	 * @return the OAuth2RestTemplate used for authentication
	 */
	OAuth2RestTemplate getUserInfoRestTemplate();

}
