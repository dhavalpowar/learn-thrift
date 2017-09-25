namespace java com.dhavalpowar.thrift.userserver

typedef i32 int

struct User{
    1:string name;
    2:int age;
}

service UserService {
        User find();
}
