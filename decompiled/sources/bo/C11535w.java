package bo;

import ao.C11129D;
import ao.C11181o0;
import io.sentry.config.AbstractC15340a;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p606Yn.C10110k;
import p909nm.C17689w;

/* JADX INFO: renamed from: bo.w */
/* JADX INFO: loaded from: classes2.dex */
public final class C11535w implements SerialDescriptor {

    /* JADX INFO: renamed from: b */
    public static final C11535w f34899b = new C11535w();

    /* JADX INFO: renamed from: c */
    public static final String f34900c = "kotlinx.serialization.json.JsonObject";

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C11129D f34901a;

    public C11535w() {
        C11181o0 c11181o0 = C11181o0.f33827a;
        C11524l c11524l = C11524l.f34887a;
        SerialDescriptor keyDesc = c11181o0.getDescriptor();
        SerialDescriptor valueDesc = c11524l.getDescriptor();
        AbstractC16544l.m18094g(keyDesc, "keyDesc");
        AbstractC16544l.m18094g(valueDesc, "valueDesc");
        this.f34901a = new C11129D("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: a */
    public final String mo10679a() {
        return f34900c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: c */
    public final boolean mo10680c() {
        this.f34901a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: d */
    public final int mo10681d(String name) {
        AbstractC16544l.m18094g(name, "name");
        return this.f34901a.mo10681d(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: e */
    public final int mo10682e() {
        this.f34901a.getClass();
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: f */
    public final String mo10683f(int i10) {
        this.f34901a.getClass();
        return String.valueOf(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: g */
    public final List mo10684g(int i10) {
        this.f34901a.mo10684g(i10);
        return C17689w.f56480Y;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.f34901a.getClass();
        return C17689w.f56480Y;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC15340a getKind() {
        this.f34901a.getClass();
        return C10110k.f29937d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: h */
    public final SerialDescriptor mo10685h(int i10) {
        return this.f34901a.mo10685h(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final boolean mo10686i(int i10) {
        this.f34901a.mo10686i(i10);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        this.f34901a.getClass();
        return false;
    }
}
