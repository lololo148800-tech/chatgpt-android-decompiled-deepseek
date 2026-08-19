package p298Lm;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import kotlin.jvm.internal.AbstractC16535c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import mm.EnumC17307j;
import p003A1.AbstractC0168G;
import p225Im.InterfaceC3776x;
import p323Mm.InterfaceC5500g;
import p544W9.AbstractC8710s3;
import p544W9.AbstractC8716t3;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Lm.t0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5203t0 extends AbstractC5202t implements InterfaceC3776x {

    /* JADX INFO: renamed from: y0 */
    public static final Object f16909y0 = new Object();

    /* JADX INFO: renamed from: s0 */
    public final AbstractC5148K f16910s0;

    /* JADX INFO: renamed from: t0 */
    public final String f16911t0;

    /* JADX INFO: renamed from: u0 */
    public final String f16912u0;

    /* JADX INFO: renamed from: v0 */
    public final Object f16913v0;

    /* JADX INFO: renamed from: w0 */
    public final Object f16914w0;

    /* JADX INFO: renamed from: x0 */
    public final C5135D0 f16915x0;

    public AbstractC5203t0(AbstractC5148K abstractC5148K, String str, String str2, PropertyDescriptor propertyDescriptor, Object obj) {
        this.f16910s0 = abstractC5148K;
        this.f16911t0 = str;
        this.f16912u0 = str2;
        this.f16913v0 = obj;
        this.f16914w0 = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C5191n0(this, 0));
        this.f16915x0 = AbstractC8716t3.m9425b(propertyDescriptor, new C5191n0(this, 1));
    }

    public final boolean equals(Object obj) {
        AbstractC5203t0 abstractC5203t0M5715c = AbstractC5147J0.m5715c(obj);
        return abstractC5203t0M5715c != null && AbstractC16544l.m18089b(this.f16910s0, abstractC5203t0M5715c.f16910s0) && AbstractC16544l.m18089b(this.f16911t0, abstractC5203t0M5715c.f16911t0) && AbstractC16544l.m18089b(this.f16912u0, abstractC5203t0M5715c.f16912u0) && AbstractC16544l.m18089b(this.f16913v0, abstractC5203t0M5715c.f16913v0);
    }

    @Override // p225Im.InterfaceC3755c
    public final String getName() {
        return this.f16911t0;
    }

    public final int hashCode() {
        return this.f16912u0.hashCode() + AbstractC0168G.m527p(this.f16910s0.hashCode() * 31, 31, this.f16911t0);
    }

    @Override // p298Lm.AbstractC5202t
    /* JADX INFO: renamed from: i */
    public final InterfaceC5500g mo5735i() {
        return mo5749s().mo5735i();
    }

    @Override // p225Im.InterfaceC3776x
    public final boolean isConst() {
        return mo5738m().isConst();
    }

    @Override // p225Im.InterfaceC3776x
    public final boolean isLateinit() {
        return mo5738m().isLateInit();
    }

    @Override // p225Im.InterfaceC3755c
    public final boolean isSuspend() {
        return false;
    }

    @Override // p298Lm.AbstractC5202t
    /* JADX INFO: renamed from: k */
    public final AbstractC5148K mo5736k() {
        return this.f16910s0;
    }

    @Override // p298Lm.AbstractC5202t
    /* JADX INFO: renamed from: l */
    public final InterfaceC5500g mo5737l() {
        mo5749s().getClass();
        return null;
    }

    @Override // p298Lm.AbstractC5202t
    /* JADX INFO: renamed from: p */
    public final boolean mo5739p() {
        return this.f16913v0 != AbstractC16535c.NO_RECEIVER;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, mm.i] */
    /* JADX INFO: renamed from: q */
    public final Member m5756q() {
        if (!mo5738m().isDelegated()) {
            return null;
        }
        ClassId classId = AbstractC5143H0.f16781a;
        AbstractC8710s3 abstractC8710s3M5711b = AbstractC5143H0.m5711b(mo5738m());
        if (abstractC8710s3M5711b instanceof C5192o) {
            C5192o c5192o = (C5192o) abstractC8710s3M5711b;
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = c5192o.f16881c;
            if (jvmPropertySignature.hasDelegateMethod()) {
                JvmProtoBuf.JvmMethodSignature delegateMethod = jvmPropertySignature.getDelegateMethod();
                if (!delegateMethod.hasName() || !delegateMethod.hasDesc()) {
                    return null;
                }
                int name = delegateMethod.getName();
                NameResolver nameResolver = c5192o.f16882d;
                return this.f16910s0.m5730i(nameResolver.getString(name), nameResolver.getString(delegateMethod.getDesc()));
            }
        }
        return (Field) this.f16914w0.getValue();
    }

    @Override // p298Lm.AbstractC5202t
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final PropertyDescriptor mo5738m() {
        Object objInvoke = this.f16915x0.invoke();
        AbstractC16544l.m18093f(objInvoke, "invoke(...)");
        return (PropertyDescriptor) objInvoke;
    }

    /* JADX INFO: renamed from: s */
    public abstract AbstractC5197q0 mo5749s();

    public final String toString() {
        DescriptorRenderer descriptorRenderer = AbstractC5141G0.f16778a;
        return AbstractC5141G0.m5708c(mo5738m());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC5203t0(AbstractC5148K container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC5203t0(AbstractC5148K container, PropertyDescriptor descriptor) {
        AbstractC16544l.m18094g(container, "container");
        AbstractC16544l.m18094g(descriptor, "descriptor");
        String strAsString = descriptor.getName().asString();
        AbstractC16544l.m18093f(strAsString, "asString(...)");
        this(container, strAsString, AbstractC5143H0.m5711b(descriptor).mo5751a(), descriptor, AbstractC16535c.NO_RECEIVER);
    }
}
