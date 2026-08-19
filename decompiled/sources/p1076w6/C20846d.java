package p1076w6;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import p008A6.C0384d;
import p1057v6.C20465e;

/* JADX INFO: renamed from: w6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C20846d {

    /* JADX INFO: renamed from: a */
    public final int f66284a;

    /* JADX INFO: renamed from: b */
    public final C0384d f66285b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f66286c = new LinkedHashMap(0, 0.75f);

    /* JADX INFO: renamed from: d */
    public C20845c f66287d;

    /* JADX INFO: renamed from: e */
    public C20845c f66288e;

    /* JADX INFO: renamed from: f */
    public int f66289f;

    public C20846d(int i10, C0384d c0384d) {
        this.f66284a = i10;
        this.f66285b = c0384d;
    }

    /* JADX INFO: renamed from: a */
    public final void m21443a(C20845c c20845c) {
        C20845c c20845c2 = c20845c.f66283d;
        if (c20845c2 == null) {
            return;
        }
        c20845c2.f66282c = c20845c.f66282c;
        C20845c c20845c3 = c20845c.f66282c;
        if (c20845c3 == null) {
            this.f66288e = c20845c2;
        } else {
            c20845c3.f66283d = c20845c2;
        }
        C20845c c20845c4 = this.f66287d;
        c20845c.f66282c = c20845c4;
        c20845c.f66283d = null;
        if (c20845c4 != null) {
            c20845c4.f66283d = c20845c;
        }
        this.f66287d = c20845c;
    }

    /* JADX INFO: renamed from: b */
    public final void m21444b(Object obj, C20465e c20465e) {
        LinkedHashMap linkedHashMap = this.f66286c;
        C20845c c20845c = (C20845c) linkedHashMap.get(obj);
        if (c20845c == null) {
            C20845c c20845c2 = this.f66287d;
            C20845c c20845c3 = new C20845c();
            c20845c3.f66280a = obj;
            c20845c3.f66281b = c20465e;
            c20845c3.f66282c = c20845c2;
            c20845c3.f66283d = null;
            this.f66287d = c20845c3;
            if (c20845c2 == null) {
                this.f66288e = c20845c3;
            } else {
                c20845c2.f66283d = c20845c3;
            }
            this.f66289f = ((Number) this.f66285b.invoke(obj, c20465e)).intValue() + this.f66289f;
            linkedHashMap.put(obj, c20845c3);
        } else {
            c20845c.f66281b = c20465e;
            m21443a(c20845c);
        }
        C20845c c20845c4 = this.f66288e;
        while (c20845c4 != null && this.f66289f > this.f66284a) {
            AbstractC16529F.m18079c(linkedHashMap).remove(c20845c4.f66280a);
            m21445c(c20845c4);
            c20845c4 = this.f66288e;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m21445c(C20845c c20845c) {
        C20845c c20845c2 = c20845c.f66283d;
        if (c20845c2 == null) {
            this.f66287d = c20845c.f66282c;
        } else {
            c20845c2.f66282c = c20845c.f66282c;
        }
        C20845c c20845c3 = c20845c.f66282c;
        if (c20845c3 == null) {
            this.f66288e = c20845c2;
        } else {
            c20845c3.f66283d = c20845c2;
        }
        int i10 = this.f66289f;
        Object obj = c20845c.f66280a;
        AbstractC16544l.m18091d(obj);
        this.f66289f = i10 - ((Number) this.f66285b.invoke(obj, c20845c.f66281b)).intValue();
        c20845c.f66280a = null;
        c20845c.f66281b = null;
        c20845c.f66282c = null;
        c20845c.f66283d = null;
    }
}
