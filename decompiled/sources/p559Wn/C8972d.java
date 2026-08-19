package p559Wn;

import ao.AbstractC11154b;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mm.EnumC17307j;
import p033B5.C0819c;
import p225Im.InterfaceC3756d;
import p571X9.AbstractC9227W;
import p909nm.AbstractC17678l;
import p909nm.C17689w;

/* JADX INFO: renamed from: Wn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C8972d extends AbstractC11154b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3756d f27406a;

    /* JADX INFO: renamed from: b */
    public final List f27407b;

    /* JADX INFO: renamed from: c */
    public final Object f27408c;

    public C8972d(InterfaceC3756d baseClass) {
        AbstractC16544l.m18094g(baseClass, "baseClass");
        this.f27406a = baseClass;
        this.f27407b = C17689w.f56480Y;
        this.f27408c = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C0819c(this, 12));
    }

    @Override // ao.AbstractC11154b
    /* JADX INFO: renamed from: c */
    public final InterfaceC3756d mo7539c() {
        return this.f27406a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f27408c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f27406a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8972d(InterfaceC3756d baseClass, Annotation[] annotationArr) {
        this(baseClass);
        AbstractC16544l.m18094g(baseClass, "baseClass");
        this.f27407b = AbstractC17678l.m19296c(annotationArr);
    }
}
