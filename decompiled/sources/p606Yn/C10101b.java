package p606Yn;

import io.sentry.config.AbstractC15340a;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p225Im.InterfaceC3756d;

/* JADX INFO: renamed from: Yn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C10101b implements SerialDescriptor {

    /* JADX INFO: renamed from: a */
    public final C10106g f29905a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3756d f29906b;

    /* JADX INFO: renamed from: c */
    public final String f29907c;

    public C10101b(C10106g c10106g, InterfaceC3756d kClass) {
        AbstractC16544l.m18094g(kClass, "kClass");
        this.f29905a = c10106g;
        this.f29906b = kClass;
        this.f29907c = c10106g.f29919a + '<' + kClass.mo4448c() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo10679a() {
        return this.f29907c;
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
        return this.f29905a.mo10681d(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo10682e() {
        return this.f29905a.f29921c;
    }

    public final boolean equals(Object obj) {
        C10101b c10101b = obj instanceof C10101b ? (C10101b) obj : null;
        return c10101b != null && this.f29905a.equals(c10101b.f29905a) && AbstractC16544l.m18089b(c10101b.f29906b, this.f29906b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo10683f(int i10) {
        return this.f29905a.f29924f[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final List mo10684g(int i10) {
        return this.f29905a.f29926h[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f29905a.f29922d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC15340a getKind() {
        return this.f29905a.f29920b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final SerialDescriptor mo10685h(int i10) {
        return this.f29905a.f29925g[i10];
    }

    public final int hashCode() {
        return this.f29907c.hashCode() + (this.f29906b.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final boolean mo10686i(int i10) {
        return this.f29905a.f29927i[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f29906b + ", original: " + this.f29905a + ')';
    }
}
