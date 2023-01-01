# Chapter 28 Network
1. TCP와 UDP의 가장 큰 차이는 데이터를 반드시 받아야 하는지, 받지 않아도 되는지 여부가 다르다. TCP는 반드시 수신하는 쪽에서 데이터를 받아야하며, UDP는 데이터를 받지 않더라도 해당 통신은 끝난다. 따라서, UDP가 TCP 보다 가벼운 통신이 가능하다.

2. 통신시 Port가 지정되지 않는 것은 주소를 알려줄 때 아파트 이름이나 동네 이름만 알려주는 것과 같다. Port는 이와 같이 서버 내에서 여러가지 프로그램에서 서로 다른 데이터를 처리해 주기 위해서 사용한다.

3. ServerSocket 클래스는 TCP로 데이터를 통신하기 위해서 사용된다.

4. ServerSocket 클래스의 accept() 메소드는 데이터를 받아 전달해 줄 Socket 객체를 생성하기 위해서 사용된다. 만약 다른 프로그램에서 아무런 데이터가 전송되지 않았을 때에는 이 accept() 메소드에서 지속적으로 대기한다. 

5. Socket 클래스는 TCP로 NIO의 Buffer 클래스와 같이 받은 데이터를 처리하거나, 데이터를 전송할 때 사용한다.

6. DatagramSocket 클래스는 UDP 데이터를 통신하기 위해서 사용된다.

7. DatagramPacket은 UDP로 데이터를 받거나 보낼 때 사용한다. 