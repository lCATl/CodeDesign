package cn.study.design.domain.service.engine.impl;

import cn.study.design.domain.model.aggregates.TreeRich;
import cn.study.design.domain.model.vo.EngineResult;
import cn.study.design.domain.model.vo.TreeNode;
import cn.study.design.domain.service.engine.EngineBase;

import java.util.Map;

/**
 * @author CAT
 * @description
 * @Copyright CodeDesign
 */
public class TreeEngineHandle extends EngineBase {

    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }

}
