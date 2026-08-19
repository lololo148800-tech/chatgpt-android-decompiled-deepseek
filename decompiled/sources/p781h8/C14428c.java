package p781h8;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: h8.c */
/* JADX INFO: loaded from: classes.dex */
public final class C14428c {

    /* JADX INFO: renamed from: a */
    public final String f45350a;

    /* JADX INFO: renamed from: b */
    public final long f45351b;

    /* JADX INFO: renamed from: c */
    public final boolean f45352c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f45353d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f45354e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f45355f;

    /* JADX INFO: renamed from: g */
    public C14427b f45356g;

    /* JADX INFO: renamed from: h */
    public C14427b f45357h;

    /* JADX INFO: renamed from: i */
    public final int f45358i;

    public C14428c(String sessionId, int i10, long j10, boolean z6) {
        AbstractC16544l.m18094g(sessionId, "sessionId");
        AbstractC14376f.m15825D(i10, "startReason");
        this.f45350a = sessionId;
        this.f45358i = i10;
        this.f45351b = j10;
        this.f45352c = z6;
        this.f45353d = new LinkedHashMap();
        this.f45354e = new LinkedHashMap();
        this.f45355f = new LinkedHashMap();
    }
}
