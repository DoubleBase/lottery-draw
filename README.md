
# 项目简介

基于DDD实现抽奖业务的示例代码

# 项目模块
- lottery-draw-activity：抽奖活动服务
- lottery-draw-activity-api：抽奖活动服务api
- lottery-draw-core：抽奖核心代码
- lottery-draw-prize-stock：奖品库存服务
- lottery-draw-prize-stock-api：奖品库存服务api
- lottery-draw-risk-control：风控服务
- lottery-draw-risk-control-api：风控服务api

# 项目启动流程
1. 启动 lottery-draw-activity
2. 启动 lottery-draw-risk-control
3. 启动 lottery-draw-core
4. 浏览器输入 http://localhost:8080/draw-lottery?userId=1&lotteryDrawActivityId=120 验证