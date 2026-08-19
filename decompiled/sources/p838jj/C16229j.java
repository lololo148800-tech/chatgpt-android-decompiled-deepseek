package p838jj;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p045Bj.C1311i;
import p861l1.xapn.suYVq;

/* JADX INFO: renamed from: jj.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C16229j {

    /* JADX INFO: renamed from: a */
    public final Map f50344a;

    /* JADX INFO: renamed from: b */
    public final String f50345b;

    /* JADX INFO: renamed from: c */
    public final String f50346c = "";

    /* JADX INFO: renamed from: d */
    public final boolean f50347d = true;

    /* JADX INFO: renamed from: e */
    public final C1311i f50348e;

    public C16229j(Map map, String str, C1311i c1311i) {
        this.f50344a = map;
        this.f50345b = str;
        this.f50348e = c1311i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C16229j.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.workflow1.ui.modal.AlertScreen");
        }
        C16229j c16229j = (C16229j) obj;
        return AbstractC16544l.m18089b(this.f50344a, c16229j.f50344a) && AbstractC16544l.m18089b(this.f50345b, c16229j.f50345b) && AbstractC16544l.m18089b(this.f50346c, c16229j.f50346c) && this.f50347d == c16229j.f50347d;
    }

    public final int hashCode() {
        return AbstractC0168G.m527p(AbstractC0168G.m527p(this.f50344a.hashCode() * 31, 31, this.f50345b), 31, this.f50346c) + (this.f50347d ? 1231 : 1237);
    }

    public final String toString() {
        return "AlertScreen(buttons=" + this.f50344a + ", message=" + this.f50345b + ", title=" + this.f50346c + ", cancelable=" + this.f50347d + suYVq.DqxKKZXZyD + this.f50348e + ')';
    }
}
