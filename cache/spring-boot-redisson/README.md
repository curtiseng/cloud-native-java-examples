### redisson 分布式demo

#### redis集群准备(GKE)
```bash
helm install --name redis-cluster --set password=rootyzf,master.service.type=LoadBalancer stable/redisstable/redis
kubectl apply -f kubernetes/redis-ingress.yaml
redis-cli -h ${GKE_INGRESS_IP} -p 6379 -a password
```
