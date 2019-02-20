### redisson 分布式demo

#### redis集群准备(GKE)
```bash
helm install --name redis-cluster --set password=password,master.service.type=NodePort,master.service.nodePort=30000 stable/redis
kubectl apply -f kubernetes/redis-ingress.yaml
redis-cli -h ${GKE_INGRESS_IP} -p 6379 -a password
```
