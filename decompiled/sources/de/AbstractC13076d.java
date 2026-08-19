package de;

import p1155zi.C21970W;
import p1155zi.EnumC21973X;

/* JADX INFO: renamed from: de.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC13076d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f41538a;

    static {
        int[] iArr = new int[EnumC21973X.values().length];
        try {
            C21970W c21970w = EnumC21973X.Companion;
            iArr[3] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            C21970W c21970w2 = EnumC21973X.Companion;
            iArr[2] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            C21970W c21970w3 = EnumC21973X.Companion;
            iArr[1] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            C21970W c21970w4 = EnumC21973X.Companion;
            iArr[4] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC21973X.Unknown.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f41538a = iArr;
    }
}
