package p358Ob;

import java.sql.Date;
import java.sql.Timestamp;
import p288Lb.C4968a;

/* JADX INFO: renamed from: Ob.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6164c {

    /* JADX INFO: renamed from: a */
    public static final boolean f20069a;

    /* JADX INFO: renamed from: b */
    public static final C6163b f20070b;

    /* JADX INFO: renamed from: c */
    public static final C6163b f20071c;

    /* JADX INFO: renamed from: d */
    public static final C4968a f20072d;

    /* JADX INFO: renamed from: e */
    public static final C4968a f20073e;

    /* JADX INFO: renamed from: f */
    public static final C4968a f20074f;

    static {
        boolean z6;
        try {
            Class.forName("java.sql.Date");
            z6 = true;
        } catch (ClassNotFoundException unused) {
            z6 = false;
        }
        f20069a = z6;
        if (z6) {
            f20070b = new C6163b(0, Date.class);
            f20071c = new C6163b(1, Timestamp.class);
            f20072d = C6162a.f20063c;
            f20073e = C6162a.f20064d;
            f20074f = C6162a.f20065e;
            return;
        }
        f20070b = null;
        f20071c = null;
        f20072d = null;
        f20073e = null;
        f20074f = null;
    }
}
