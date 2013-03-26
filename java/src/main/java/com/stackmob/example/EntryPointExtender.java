/**
 * Copyright 2012 StackMob
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.stackmob.example;

import com.stackmob.example.crud.*;
import com.stackmob.example.relations.*;

import com.stackmob.core.customcode.CustomCodeMethod;
import com.stackmob.core.jar.JarEntryObject;
import com.stackmob.example.util.ReadParams;

import java.util.ArrayList;
import java.util.List;

public class EntryPointExtender extends JarEntryObject {

  @Override
  public List<CustomCodeMethod> methods() {
    List<CustomCodeMethod> list = new ArrayList<CustomCodeMethod>();
    list.add(new HelloWorld());
    list.add(new TwilioSMS());
    list.add(new SendGrid());
    list.add(new Stripe());
    list.add(new CreateObject());
    list.add(new ReadObject());
    list.add(new UpdateObject());
    list.add(new DeleteObject());
    list.add(new ReadAllObjects());
    list.add(new QueryByField());
    list.add(new QueryByEquality());
    list.add(new PaginateResults());
    list.add(new DeleteMultiple());
    list.add(new OneStepCreateRelate());
    list.add(new FetchExpand());
    list.add(new RelateToParent());
    list.add(new DeleteRelation());
    list.add(new ReadParams());
//    list.add(new Logging());
    return list;
  }

}
