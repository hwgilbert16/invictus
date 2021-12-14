import {
  WebSocketGateway,
  WebSocketServer,
  OnGatewayConnection
} from '@nestjs/websockets';
import { Socket, Server } from 'socket.io';

@WebSocketGateway()
export class AppGateway implements OnGatewayConnection {
  @WebSocketServer() server: Server;

  handleConnection(client: any, ...args: any[]): any {

  }
}
