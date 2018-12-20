### 一、度量类型

#### dropwizard支持的度量类型

1. Gauge

   A gauge is an instantaneous measurement of a value. For example, we may want to measure the number of pending jobs in a queue:

2. Counter

   A counter is just a gauge for an `AtomicLong` instance. You can increment or decrement its value. For example, we may want a more efficient way of measuring the pending job in a queue:

3. Meter([EMA](https://en.wikipedia.org/wiki/Moving_average#Exponential_moving_average))

   A meter measures the rate of events over time (e.g., “requests per second”). In addition to the mean rate, meters also track 1-, 5-, and 15-minute moving averages.

4. Histogram([variance](https://www.johndcook.com/blog/standard_deviation/))

   A histogram measures the statistical distribution of values in a stream of data. In addition to minimum, maximum, mean, etc., it also measures median, 75th, 90th, 95th, 98th, 99th, and 99.9th percentiles.

5. Timer

   A timer measures both the rate that a particular piece of code is called and the distribution of its duration.

#### prometheus支持的度量类型

1. Gauge

   A *gauge* is a metric that represents a single numerical value that can arbitrarily go up and down.

   Gauges are typically used for measured values like temperatures or current memory usage, but also "counts" that can go up and down, like the number of running goroutines.

2. Counter

   A *counter* is a cumulative metric that represents a single [monotonically increasing counter](https://en.wikipedia.org/wiki/Monotonic_function) whose value can only increase or be reset to zero on restart. For example, you can use a counter to represent the number of requests served, tasks completed, or errors.

3. Histogram

   A *histogram* samples observations (usually things like request durations or response sizes) and counts them in configurable buckets. It also provides a sum of all observed values.

4. Summary

   Similar to a *histogram*, a *summary* samples observations (usually things like request durations and response sizes). While it also provides a total count of observations and a sum of all observed values, it calculates configurable quantiles over a sliding time window.

### 二、其他功能

#### dropwizard

+ Health Checks
+ MemoryUsageGaugeSet(Gauge)
  + jvm.memory.pools.PS-Survivor-Space.used-after-gc
  + jvm.memory.pools.PS-Survivor-Space.used
  + jvm.memory.pools.PS-Survivor-Space.usage
  + jvm.memory.pools.PS-Old-Gen.used
  + jvm.memory.pools.PS-Eden-Space.max
  + jvm.memory.pools.Compressed-Class-Space.used
  + jvm.memory.pools.Compressed-Class-Space.max
  + jvm.memory.pools.Metaspace.init
  + jvm.memory.pools.Code-Cache.usage
  + jvm.memory.pools.Code-Cache.committed
  + jvm.memory.total.committed
  + jvm.memory.total.used
  + jvm.memory.total.max
  + jvm.memory.total.init
  + jvm.memory.non-heap.usage
+ GarbageCollectorMetricSet(Gauge)
  + jvm.garbage.PS-MarkSweep.count
  + jvm.garbage.PS-MarkSweep.time
  + 
+ ThreadStatesGaugeSet(Gauge)
  + jvm.threads.waiting.count
  + jvm.threads.timed_waiting.count
  + jvm.threads.terminated.count
  + jvm.threads.new.count
  + jvm.threads.runnable.count
  + jvm.threads.deadlocks
  + jvm.threads.blocked.count
  + jvm.threads.daemon.count
  + jvm.threads.count
+ FileDescriptorRatioGauge
+ BufferPoolMetricSet
+ JvmAttributeGaugeSet
+ HikariConfigMXBean(Histogram)