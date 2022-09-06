package Practice;

import java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject;

public class RestAssred {

	JsonObject obj=new JsonObject();
	obj.put("copyRight","Jiaqi Sun \\uff08\\u5b59\\u5609\\u742a\\uff09\")
	obj.put("date","2022-09-06")
	obj.put("explanation","Yes, but how many dark clouds have a multicolored lining? Pictured")
}


    given()
    .body(obj)
     .ContentType(ContentType.jason)

   .When()
   .post("/addProject")

   .then()
   .asssertThat.statuscode(201)
    .log().al
