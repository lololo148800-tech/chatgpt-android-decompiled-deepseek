package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1439n;
import p1140z1.AbstractC21672S;
import p635a1.AbstractC10458p;
import p635a1.C10444b;
import p635a1.C10451i;
import p736f0.C13478P;
import p758g0.InterfaceC13726B;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18067d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "Lz1/S;", "Lf0/P;", "animation_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final /* data */ class SizeAnimationModifierElement extends AbstractC21672S {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC13726B f32374Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC1439n f32375Z;

    public SizeAnimationModifierElement(InterfaceC13726B interfaceC13726B, InterfaceC1439n interfaceC1439n) {
        this.f32374Y = interfaceC13726B;
        this.f32375Z = interfaceC1439n;
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: a */
    public final AbstractC10458p mo11196a() {
        return new C13478P(this.f32374Y, this.f32375Z);
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
        if (!AbstractC16544l.m18089b(this.f32374Y, sizeAnimationModifierElement.f32374Y)) {
            return false;
        }
        C10451i c10451i = C10444b.f30934Y;
        return c10451i.equals(c10451i) && AbstractC16544l.m18089b(this.f32375Z, sizeAnimationModifierElement.f32375Z);
    }

    public final int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(-1.0f) * 31) + (this.f32374Y.hashCode() * 31)) * 31;
        InterfaceC1439n interfaceC1439n = this.f32375Z;
        return iFloatToIntBits + (interfaceC1439n == null ? 0 : interfaceC1439n.hashCode());
    }

    @Override // p1140z1.AbstractC21672S
    /* JADX INFO: renamed from: i */
    public final void mo11197i(AbstractC10458p abstractC10458p) {
        C13478P c13478p = (C13478P) abstractC10458p;
        c13478p.f42649A0 = this.f32374Y;
        c13478p.f42650B0 = this.f32375Z;
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.f32374Y + ", alignment=" + C10444b.f30934Y + ", finishedListener=" + this.f32375Z + ')';
    }
}
