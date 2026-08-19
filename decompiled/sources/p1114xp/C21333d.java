package p1114xp;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0563B;
import p049Bm.InterfaceC1439n;
import p225Im.InterfaceC3756d;

/* JADX INFO: renamed from: xp.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C21333d {

    /* JADX INFO: renamed from: f */
    public static int f67764f = 1;

    /* JADX INFO: renamed from: a */
    public final int f67765a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f67766b;

    /* JADX INFO: renamed from: c */
    public final Object f67767c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3756d f67768d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0563B f67769e;

    public C21333d(InterfaceC21347r obj, InterfaceC1439n handler, InterfaceC3756d key, AbstractC0563B queue) {
        AbstractC16544l.m18094g(obj, "obj");
        AbstractC16544l.m18094g(handler, "handler");
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(queue, "queue");
        this.f67767c = handler;
        this.f67768d = key;
        this.f67769e = queue;
        int i10 = f67764f;
        f67764f = i10 + 1;
        this.f67765a = i10;
        this.f67766b = new WeakReference(obj);
    }
}
