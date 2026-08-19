package bo;

import io.sentry.config.AbstractC15340a;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mm.C17314q;
import p049Bm.InterfaceC1426a;
import p571X9.AbstractC9227W;
import p909nm.C17689w;

/* JADX INFO: renamed from: bo.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C11525m implements SerialDescriptor {

    /* JADX INFO: renamed from: a */
    public final C17314q f34889a;

    public C11525m(InterfaceC1426a interfaceC1426a) {
        this.f34889a = AbstractC9227W.m9800c(interfaceC1426a);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo10679a() {
        return m12919b().mo10679a();
    }

    /* JADX INFO: renamed from: b */
    public final SerialDescriptor m12919b() {
        return (SerialDescriptor) this.f34889a.getValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: c */
    public final boolean mo10680c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo10681d(String name) {
        AbstractC16544l.m18094g(name, "name");
        return m12919b().mo10681d(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo10682e() {
        return m12919b().mo10682e();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo10683f(int i10) {
        return m12919b().mo10683f(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final List mo10684g(int i10) {
        return m12919b().mo10684g(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return C17689w.f56480Y;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC15340a getKind() {
        return m12919b().getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final SerialDescriptor mo10685h(int i10) {
        return m12919b().mo10685h(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final boolean mo10686i(int i10) {
        return m12919b().mo10686i(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }
}
