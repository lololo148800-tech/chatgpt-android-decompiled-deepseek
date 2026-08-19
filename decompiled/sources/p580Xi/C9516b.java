package p580Xi;

import bo.AbstractC11523k;
import bo.C11534v;
import com.segment.analytics.kotlin.core.AbstractC12774a;
import com.segment.analytics.kotlin.core.Settings;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16644c;
import p228J.AbstractC3794B0;
import p530Vi.C8312h;
import p554Wi.EnumC8881h;
import p554Wi.InterfaceC8882i;
import p594Y9.AbstractC9804S3;
import p646aj.AbstractC10628h;

/* JADX INFO: renamed from: Xi.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C9516b implements InterfaceC8882i {
    public static final C9515a Companion = new C9515a();

    /* JADX INFO: renamed from: Y */
    public C8312h f28637Y;

    /* JADX INFO: renamed from: Z */
    public C16644c f28638Z;

    /* JADX INFO: renamed from: o0 */
    public final String f28639o0 = AbstractC3794B0.m4498w("randomUUID().toString()");

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: a */
    public final AbstractC12774a mo7802a(AbstractC12774a abstractC12774a) {
        C11534v c11534v = new C11534v(0);
        AbstractC10628h.m11000b(c11534v, abstractC12774a.mo14507d());
        C16644c c16644c = this.f28638Z;
        if (c16644c == null) {
            AbstractC16544l.m18103p("library");
            throw null;
        }
        c11534v.m12927c("library", c16644c);
        c11534v.m12927c("instanceId", AbstractC11523k.m12910c(this.f28639o0));
        abstractC12774a.mo14515l(c11534v.m12925a());
        return abstractC12774a;
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: b */
    public final void mo7803b(Settings settings, int i10) {
        AbstractC9804S3.m10428b(settings, i10);
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: c */
    public final C8312h mo7804c() {
        C8312h c8312h = this.f28637Y;
        if (c8312h != null) {
            return c8312h;
        }
        AbstractC16544l.m18103p("analytics");
        throw null;
    }

    @Override // p554Wi.InterfaceC8882i
    /* JADX INFO: renamed from: d */
    public final void mo7805d(C8312h c8312h) {
        this.f28637Y = c8312h;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC16645d element = AbstractC11523k.m12910c("analytics-kotlin");
        AbstractC16544l.m18094g(element, "element");
        AbstractC16645d element2 = AbstractC11523k.m12910c("1.18.2");
        AbstractC16544l.m18094g(element2, "element");
        this.f28638Z = new C16644c(linkedHashMap);
    }

    @Override // p554Wi.InterfaceC8882i
    public final EnumC8881h getType() {
        return EnumC8881h.f27183Y;
    }
}
