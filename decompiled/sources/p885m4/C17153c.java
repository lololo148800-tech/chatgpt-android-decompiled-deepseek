package p885m4;

import bb.AbstractC11278C;
import java.util.List;

/* JADX INFO: renamed from: m4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17153c {

    /* JADX INFO: renamed from: a */
    public final AbstractC11278C f54820a;

    /* JADX INFO: renamed from: b */
    public final long f54821b;

    /* JADX INFO: renamed from: c */
    public final long f54822c;

    /* JADX INFO: renamed from: d */
    public final long f54823d;

    public C17153c(List list, long j10, long j11) {
        this.f54820a = AbstractC11278C.m12691t(list);
        this.f54821b = j10;
        this.f54822c = j11;
        long j12 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            j12 = j10 + j11;
        }
        this.f54823d = j12;
    }
}
