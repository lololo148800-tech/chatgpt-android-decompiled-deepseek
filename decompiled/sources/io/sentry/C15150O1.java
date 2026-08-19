package io.sentry;

import p658b5.C11238i;

/* JADX INFO: renamed from: io.sentry.O1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15150O1 {

    /* JADX INFO: renamed from: a */
    public final C15524y1 f47161a;

    /* JADX INFO: renamed from: b */
    public volatile C11238i f47162b;

    /* JADX INFO: renamed from: c */
    public volatile C15134J0 f47163c;

    public C15150O1(C15524y1 c15524y1, C11238i c11238i, C15134J0 c15134j0) {
        this.f47162b = c11238i;
        this.f47163c = c15134j0;
        this.f47161a = c15524y1;
    }

    public C15150O1(C15150O1 c15150o1) {
        this.f47161a = c15150o1.f47161a;
        this.f47162b = c15150o1.f47162b;
        C15134J0 c15134j0 = c15150o1.f47163c;
        c15134j0.getClass();
        this.f47163c = new C15134J0(c15134j0);
    }
}
