package com.openai.design.modifier;

import bd.C11343d;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1439n;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p635a1.C10444b;
import p635a1.C10451i;
import p758g0.InterfaceC13726B;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Lcom/openai/design/modifier/SizeAnimationModifierElement;", "Lz1/S;", "Lbd/d;", "design_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class SizeAnimationModifierElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC13726B f37247Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC1439n f37248Z;

    public SizeAnimationModifierElement(InterfaceC13726B interfaceC13726B, InterfaceC1439n interfaceC1439n) {
        this.f37247Y = interfaceC13726B;
        this.f37248Z = interfaceC1439n;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C11343d(this.f37247Y, this.f37248Z);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        if (!this.f37247Y.equals(sizeAnimationModifierElement.f37247Y)) {
            return false;
        }
        C10451i c10451i = C10444b.f30934Y;
        return c10451i.equals(c10451i) && AbstractC16544l.m18089b(this.f37248Z, sizeAnimationModifierElement.f37248Z);
    }

    public final int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(-1.0f) * 31) + (this.f37247Y.hashCode() * 31)) * 31;
        InterfaceC1439n interfaceC1439n = this.f37248Z;
        return iFloatToIntBits + (interfaceC1439n == null ? 0 : interfaceC1439n.hashCode());
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C11343d node = (C11343d) abstractC10458p;
        AbstractC16544l.m18094g(node, "node");
        node.f34297z0 = this.f37247Y;
        node.f34292A0 = this.f37248Z;
    }

    public final String toString() {
        return "█";
    }
}
