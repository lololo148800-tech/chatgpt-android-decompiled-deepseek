package p1095x1;

import com.google.protobuf.AbstractC12107L1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1140z1.C21658D;
import p228J.AbstractC3794B0;
import p392Q0.C6543a;
import p492U1.EnumC7546k;
import p523V9.AbstractC8111i5;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: x1.B */
/* JADX INFO: loaded from: classes.dex */
public final class C21048B implements InterfaceC21083f0 {

    /* JADX INFO: renamed from: Y */
    public EnumC7546k f66940Y = EnumC7546k.f23905Z;

    /* JADX INFO: renamed from: Z */
    public float f66941Z;

    /* JADX INFO: renamed from: o0 */
    public float f66942o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C21053G f66943p0;

    public C21048B(C21053G c21053g) {
        this.f66943p0 = c21053g;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: F */
    public final long mo7859F(int i10) {
        return m21502b(mo7861O(i10));
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: J */
    public final long mo7860J(float f10) {
        return m21502b(mo7862P(f10));
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: O */
    public final float mo7861O(int i10) {
        return i10 / getDensity();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: P */
    public final float mo7862P(float f10) {
        return f10 / getDensity();
    }

    @Override // p1095x1.InterfaceC21059M
    /* JADX INFO: renamed from: R */
    public final InterfaceC21058L mo19936R(int i10, int i11, Map map, InterfaceC1436k interfaceC1436k) {
        return m21501a(i10, i11, map, interfaceC1436k);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: X */
    public final float mo7863X() {
        return this.f66942o0;
    }

    @Override // p1095x1.InterfaceC21095p
    /* JADX INFO: renamed from: Z */
    public final boolean mo19937Z() {
        C21053G c21053g = this.f66943p0;
        return c21053g.f66955Y.m22064w() == 4 || c21053g.f66955Y.m22064w() == 2;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC21058L m21501a(int i10, int i11, Map map, InterfaceC1436k interfaceC1436k) {
        if ((i10 & (-16777216)) == 0 && ((-16777216) & i11) == 0) {
            return new C21047A(i10, i11, map, this, this.f66943p0, interfaceC1436k);
        }
        AbstractC8111i5.m8592c("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long m21502b(float f10) {
        return AbstractC3794B0.m4490o(this, f10);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: b0 */
    public final float mo7864b0(float f10) {
        return getDensity() * f10;
    }

    @Override // p492U1.InterfaceC7537b
    public final float getDensity() {
        return this.f66941Z;
    }

    @Override // p1095x1.InterfaceC21095p
    public final EnumC7546k getLayoutDirection() {
        return this.f66940Y;
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: i0 */
    public final int mo7865i0(long j10) {
        return Math.round(mo7869t0(j10));
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ int mo7866k0(float f10) {
        return AbstractC3794B0.m4485j(this, f10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p1095x1.InterfaceC21083f0
    /* JADX INFO: renamed from: m0 */
    public final List mo21503m0(Object obj, InterfaceC1439n interfaceC1439n) {
        Object obj2;
        C21658D c21658d;
        C21053G c21053g = this.f66943p0;
        c21053g.m21509d();
        C21658D c21658d2 = c21053g.f66955Y;
        int iM22064w = c21658d2.m22064w();
        if (!(iM22064w == 1 || iM22064w == 3 || iM22064w == 2 || iM22064w == 4)) {
            AbstractC8111i5.m8592c("subcompose can only be used inside the measure or layout blocks");
            throw null;
        }
        HashMap map = c21053g.f66961s0;
        Object obj3 = map.get(obj);
        if (obj3 == null) {
            C21658D c21658d3 = (C21658D) c21053g.f66964v0.remove(obj);
            if (c21658d3 != null) {
                int i10 = c21053g.f66953A0;
                if (i10 <= 0) {
                    obj2 = obj3;
                    AbstractC8111i5.m8592c("Check failed.");
                    throw null;
                }
                obj2 = obj3;
                c21053g.f66953A0 = i10 - 1;
                c21658d = c21658d3;
            } else {
                C21658D c21658dM21513j = c21053g.m21513j(obj);
                if (c21658dM21513j == null) {
                    obj2 = obj3;
                    int i11 = c21053g.f66958p0;
                    C21658D c21658d4 = new C21658D(true, 2, 0);
                    c21658d2.f68661x0 = true;
                    c21658d2.m22016N(i11, c21658d4);
                    c21658d2.f68661x0 = false;
                    c21658d = c21658d4;
                } else {
                    obj2 = obj3;
                    c21658d = c21658dM21513j;
                }
            }
            map.put(obj, c21658d);
            obj2 = c21658d;
        }
        obj2 = obj3;
        C21658D c21658d5 = (C21658D) obj2;
        if (AbstractC17680n.m19344T(c21053g.f66958p0, c21658d2.m22057r()) != c21658d5) {
            int iM7107l = ((C6543a) c21658d2.m22057r()).f21176Y.m7107l(c21658d5);
            int i12 = c21053g.f66958p0;
            if (iM7107l < i12) {
                throw new IllegalArgumentException(AbstractC12107L1.m13824o(obj, "Key \"", "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i12 != iM7107l) {
                c21658d2.f68661x0 = true;
                c21658d2.m22039g0(iM7107l, i12, 1);
                c21658d2.f68661x0 = false;
            }
        }
        c21053g.f66958p0++;
        c21053g.m21512g(c21658d5, obj, interfaceC1439n);
        return (iM22064w == 1 || iM22064w == 3) ? c21658d5.m22052o() : c21658d5.m22050n();
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ long mo7867r0(long j10) {
        return AbstractC3794B0.m4489n(j10, this);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ long mo7868s(long j10) {
        return AbstractC3794B0.m4487l(j10, this);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ float mo7869t0(long j10) {
        return AbstractC3794B0.m4488m(j10, this);
    }

    @Override // p492U1.InterfaceC7537b
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ float mo7870w(long j10) {
        return AbstractC3794B0.m4486k(j10, this);
    }
}
