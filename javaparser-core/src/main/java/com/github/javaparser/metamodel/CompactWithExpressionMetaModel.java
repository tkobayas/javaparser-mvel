package com.github.javaparser.metamodel;

import java.util.Optional;
import org.mvel3.parser.ast.expr.CompactWithExpression;
import com.github.javaparser.ast.Generated;
import com.github.javaparser.ast.Node;

@Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
public class CompactWithExpressionMetaModel extends ExpressionMetaModel {

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    CompactWithExpressionMetaModel(Optional<BaseNodeMetaModel> superBaseNodeMetaModel) {
        super(superBaseNodeMetaModel, CompactWithExpression.class, "CompactWithExpression", "org.mvel3.parser.ast.expr", false, false);
    }

    @Generated("com.github.javaparser.generator.metamodel.NodeMetaModelGenerator")
    protected CompactWithExpressionMetaModel(Optional<BaseNodeMetaModel> superNodeMetaModel, Class<? extends Node> type, String name, String packageName, boolean isAbstract, boolean hasWildcard) {
        super(superNodeMetaModel, type, name, packageName, isAbstract, hasWildcard);
    }

    public PropertyMetaModel targetPropertyMetaModel;

    public PropertyMetaModel assignmentsPropertyMetaModel;
}
