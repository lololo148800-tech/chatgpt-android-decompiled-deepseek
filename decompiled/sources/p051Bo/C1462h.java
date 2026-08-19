package p051Bo;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p026Ao.C0654C;

/* JADX INFO: renamed from: Bo.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C1462h {

    /* JADX INFO: renamed from: a */
    public final C0654C f3845a;

    /* JADX INFO: renamed from: b */
    public final boolean f3846b;

    /* JADX INFO: renamed from: c */
    public final String f3847c;

    /* JADX INFO: renamed from: d */
    public final long f3848d;

    /* JADX INFO: renamed from: e */
    public final long f3849e;

    /* JADX INFO: renamed from: f */
    public final long f3850f;

    /* JADX INFO: renamed from: g */
    public final int f3851g;

    /* JADX INFO: renamed from: h */
    public final long f3852h;

    /* JADX INFO: renamed from: i */
    public final int f3853i;

    /* JADX INFO: renamed from: j */
    public final int f3854j;

    /* JADX INFO: renamed from: k */
    public final Long f3855k;

    /* JADX INFO: renamed from: l */
    public final Long f3856l;

    /* JADX INFO: renamed from: m */
    public final Long f3857m;

    /* JADX INFO: renamed from: n */
    public final Integer f3858n;

    /* JADX INFO: renamed from: o */
    public final Integer f3859o;

    /* JADX INFO: renamed from: p */
    public final Integer f3860p;

    /* JADX INFO: renamed from: q */
    public final ArrayList f3861q;

    public C1462h(C0654C canonicalPath, boolean z6, String comment, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l4, Long l10, Long l11, Integer num, Integer num2, Integer num3) {
        AbstractC16544l.m18094g(canonicalPath, "canonicalPath");
        AbstractC16544l.m18094g(comment, "comment");
        this.f3845a = canonicalPath;
        this.f3846b = z6;
        this.f3847c = comment;
        this.f3848d = j10;
        this.f3849e = j11;
        this.f3850f = j12;
        this.f3851g = i10;
        this.f3852h = j13;
        this.f3853i = i11;
        this.f3854j = i12;
        this.f3855k = l4;
        this.f3856l = l10;
        this.f3857m = l11;
        this.f3858n = num;
        this.f3859o = num2;
        this.f3860p = num3;
        this.f3861q = new ArrayList();
    }

    public /* synthetic */ C1462h(C0654C c0654c, boolean z6, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l4, Long l10, Long l11, int i13) {
        this(c0654c, z6, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? -1L : j10, (i13 & 16) != 0 ? -1L : j11, (i13 & 32) != 0 ? -1L : j12, (i13 & 64) != 0 ? -1 : i10, (i13 & 128) != 0 ? -1L : j13, (i13 & 256) != 0 ? -1 : i11, (i13 & 512) != 0 ? -1 : i12, (i13 & 1024) != 0 ? null : l4, (i13 & 2048) != 0 ? null : l10, (i13 & 4096) != 0 ? null : l11, null, null, null);
    }
}
