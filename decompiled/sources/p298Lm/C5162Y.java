package p298Lm;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16553u;
import mm.EnumC17307j;
import p225Im.InterfaceC3776x;
import p228J.AbstractC3794B0;
import p544W9.AbstractC8716t3;
import p571X9.AbstractC9227W;

/* JADX INFO: renamed from: Lm.Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C5162Y extends AbstractC5142H {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ InterfaceC3776x[] f16815g;

    /* JADX INFO: renamed from: c */
    public final C5135D0 f16816c;

    /* JADX INFO: renamed from: d */
    public final C5135D0 f16817d;

    /* JADX INFO: renamed from: e */
    public final Object f16818e;

    /* JADX INFO: renamed from: f */
    public final Object f16819f;

    static {
        C16553u c16553u = new C16553u(C5162Y.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f16815g = new InterfaceC3776x[]{c16527d.mo5699h(c16553u), AbstractC3794B0.m4493r(C5162Y.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0, c16527d), AbstractC3794B0.m4493r(C5162Y.class, "members", "getMembers()Ljava/util/Collection;", 0, c16527d)};
    }

    public C5162Y(C5165a0 c5165a0) {
        super(c5165a0);
        this.f16816c = AbstractC8716t3.m9425b(null, new C5159V(c5165a0, 1));
        this.f16817d = AbstractC8716t3.m9425b(null, new C5160W(this, 0));
        EnumC17307j enumC17307j = EnumC17307j.f55133Y;
        this.f16818e = AbstractC9227W.m9799b(enumC17307j, new C5161X(this, c5165a0));
        this.f16819f = AbstractC9227W.m9799b(enumC17307j, new C5160W(this, 1));
        AbstractC8716t3.m9425b(null, new C5161X(c5165a0, this));
    }
}
