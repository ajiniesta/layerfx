/** 
 * Copyright [2013] Antonio J. Iniesta
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * 
 * File created: 02/02/2013 at 01:30:23 by antonio
 */
package com.iniesta.layerfx.testing;

import com.iniesta.layerfx.FXMLHandler;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author antonio
 *
 */
public class LaunchTestView extends Application {

	public static void main(String [] args){
		launch(args);
	}
	
	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage arg0) throws Exception {
		FXMLHandler handler = new FXMLHandler(TestView.class);
		@SuppressWarnings("unused")
		TestView tv = (TestView)handler.getHandlingView();
		handler.showWindow("Test");
	}

}
