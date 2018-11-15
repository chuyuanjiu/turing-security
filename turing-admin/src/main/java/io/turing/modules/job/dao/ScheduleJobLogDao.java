/**
 * Copyright 2018 
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package io.turing.modules.job.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import io.turing.modules.job.entity.ScheduleJobLogEntity;

/**
 * 定时任务日志
 *
 * @author chu
 * @since 1.2.0 2016-11-28
 */
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {
	
}