/*
 * Copyright 2006-2007 the original author or authors.
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
package org.springframework.batch.core.runtime;

import org.springframework.batch.repeat.ExitStatus;
import org.springframework.batch.support.ExceptionClassifier;

/**
 * Extension of the {@link ExceptionClassifier} that explicitly deals with
 * returns an {@link ExitStatus}. This is useful for mapping from an exception
 * type to an exit status with a customised code or detailed message.
 * 
 * @author Lucas Ward
 * 
 */
public interface ExitStatusExceptionClassifier extends ExceptionClassifier {

	public static final String FATAL_EXCEPTION = "FATAL_EXCEPTION";

	public static final String JOB_INTERRUPTED = "JOB_INTERRUPTED";

	/**
	 * Typesafe version of classify that explicitly returns an
	 * {@link ExitStatus} object.
	 * 
	 * @param throwable
	 * @return ExitStatus representing the ExitCode and Message for the given
	 * exception.
	 */
	public ExitStatus classifyForExitCode(Throwable throwable);
}
