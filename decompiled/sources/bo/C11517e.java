package bo;

import ao.C11156c;
import io.sentry.config.AbstractC15340a;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p594Y9.AbstractC9961r4;
import p606Yn.C10110k;
import p909nm.C17689w;

/* JADX INFO: renamed from: bo.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C11517e implements SerialDescriptor {

    /* JADX INFO: renamed from: b */
    public static final C11517e f34846b = new C11517e();

    /* JADX INFO: renamed from: c */
    public static final String f34847c = "kotlinx.serialization.json.JsonArray";

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C11156c f34848a = (C11156c) AbstractC9961r4.m10614a(C11524l.f34887a).f33796c;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo10679a() {
        return f34847c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: c */
    public final boolean mo10680c() {
        this.f34848a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo10681d(String name) {
        AbstractC16544l.m18094g(name, "name");
        return this.f34848a.mo10681d(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo10682e() {
        this.f34848a.getClass();
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo10683f(int i10) {
        this.f34848a.getClass();
        return String.valueOf(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final List mo10684g(int i10) {
        this.f34848a.mo10684g(i10);
        return C17689w.f56480Y;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.f34848a.getClass();
        return C17689w.f56480Y;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC15340a getKind() {
        this.f34848a.getClass();
        return C10110k.f29936c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final SerialDescriptor mo10685h(int i10) {
        return this.f34848a.mo10685h(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final boolean mo10686i(int i10) {
        this.f34848a.mo10686i(i10);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        this.f34848a.getClass();
        return false;
    }
}
