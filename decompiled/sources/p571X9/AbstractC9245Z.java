package p571X9;

import kotlin.jvm.internal.AbstractC16544l;
import p492U1.InterfaceC7537b;

/* JADX INFO: renamed from: X9.Z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9245Z {
    /* JADX INFO: renamed from: a */
    public static final float m9819a(int i10, InterfaceC7537b density) {
        AbstractC16544l.m18094g(density, "density");
        return density.mo7861O(i10);
    }

    /* JADX INFO: renamed from: b */
    public static final double m9820b(long j10) {
        return ((j10 >>> 11) * ((double) 2048)) + (j10 & 2047);
    }
}
