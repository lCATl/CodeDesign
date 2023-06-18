package cn.study.design.domain.service.engine;

import cn.study.design.domain.model.aggregates.TreeRich;
import cn.study.design.domain.model.vo.EngineResult;

import java.util.Map;

public interface IEngine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}
