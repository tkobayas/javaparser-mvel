package org.mvel3.parser.ast.expr;

import com.github.javaparser.TokenRange;
import com.github.javaparser.ast.AllFieldsConstructor;
import com.github.javaparser.ast.Generated;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.expr.AssignExpr;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.observer.ObservableProperty;
import com.github.javaparser.ast.visitor.CloneVisitor;
import com.github.javaparser.ast.visitor.GenericVisitor;
import com.github.javaparser.ast.visitor.VoidVisitor;
import com.github.javaparser.metamodel.CompactWithExpressionMetaModel;
import com.github.javaparser.metamodel.JavaParserMetaModel;

import java.util.Optional;
import java.util.function.Consumer;

import static com.github.javaparser.utils.Utils.assertNotNull;

public class CompactWithExpression extends Expression {

    private NameExpr target;

    private NodeList<AssignExpr> assignments;

    @AllFieldsConstructor
    public CompactWithExpression(NameExpr target, NodeList<AssignExpr> assignments) {
        this(null, target, assignments);
    }

    @Generated("com.github.javaparser.generator.core.node.MainConstructorGenerator")
    public CompactWithExpression(TokenRange tokenRange, NameExpr target, NodeList<AssignExpr> assignments) {
        super(tokenRange);
        setTarget(target);
        setAssignments(assignments);
        customInitialization();
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.AcceptGenerator")
    public <R, A> R accept(final GenericVisitor<R, A> v, final A arg) {
        return v.visit(this, arg);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.AcceptGenerator")
    public <A> void accept(final VoidVisitor<A> v, final A arg) {
        v.visit(this, arg);
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public NameExpr getTarget() {
        return target;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public CompactWithExpression setTarget(final NameExpr target) {
        assertNotNull(target);
        if (target == this.target) {
            return this;
        }
        notifyPropertyChange(ObservableProperty.TARGET, this.target, target);
        if (this.target != null)
            this.target.setParentNode(null);
        this.target = target;
        setAsParentNodeOf(target);
        return this;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public NodeList<AssignExpr> getAssignments() {
        return assignments;
    }

    @Generated("com.github.javaparser.generator.core.node.PropertyGenerator")
    public CompactWithExpression setAssignments(final NodeList<AssignExpr> assignments) {
        assertNotNull(assignments);
        if (assignments == this.assignments) {
            return this;
        }
        notifyPropertyChange(ObservableProperty.EXPRESSIONS, this.assignments, assignments);
        if (this.assignments != null)
            this.assignments.setParentNode(null);
        this.assignments = assignments;
        setAsParentNodeOf(assignments);
        return this;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isCompactWithExpression() {
        return true;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public CompactWithExpression asCompactWithExpression() {
        return this;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public Optional<CompactWithExpression> toCompactWithExpression() {
        return Optional.of(this);
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifCompactWithExpression(Consumer<CompactWithExpression> action) {
        action.accept(this);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.RemoveMethodGenerator")
    public boolean remove(Node node) {
        if (node == null) {
            return false;
        }
        for (int i = 0; i < assignments.size(); i++) {
            if (assignments.get(i) == node) {
                assignments.remove(i);
                return true;
            }
        }
        return super.remove(node);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.ReplaceMethodGenerator")
    public boolean replace(Node node, Node replacementNode) {
        if (node == null) {
            return false;
        }
        for (int i = 0; i < assignments.size(); i++) {
            if (assignments.get(i) == node) {
                assignments.set(i, (AssignExpr) replacementNode);
                return true;
            }
        }
        if (node == target) {
            setTarget((NameExpr) replacementNode);
            return true;
        }
        return super.replace(node, replacementNode);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.CloneGenerator")
    public CompactWithExpression clone() {
        return (CompactWithExpression) accept(new CloneVisitor(), null);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.GetMetaModelGenerator")
    public CompactWithExpressionMetaModel getMetaModel() {
        return JavaParserMetaModel.compactWithExpressionMetaModel;
    }
}
