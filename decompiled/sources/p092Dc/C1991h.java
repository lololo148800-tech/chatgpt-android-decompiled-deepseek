package p092Dc;

import android.app.Application;
import android.content.res.Resources;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p204I1.C3590f;
import p571X9.AbstractC9225V3;

/* JADX INFO: renamed from: Dc.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C1991h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5888a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5889b;

    public /* synthetic */ C1991h(Object obj, int i10) {
        this.f5888a = i10;
        this.f5889b = obj;
    }

    /* JADX INFO: renamed from: a */
    public final C3590f m3159a(int i10, List clickables) {
        switch (this.f5888a) {
            case 0:
                AbstractC16544l.m18094g(clickables, "clickables");
                Resources resources = ((Application) this.f5889b).getResources();
                AbstractC16544l.m18093f(resources, "getResources(...)");
                return AbstractC9225V3.m9796c(resources, i10, clickables);
            default:
                AbstractC16544l.m18094g(clickables, "clickables");
                Resources resources2 = (Resources) this.f5889b;
                AbstractC16544l.m18091d(resources2);
                return AbstractC9225V3.m9796c(resources2, i10, clickables);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m3160b(int i10) {
        switch (this.f5888a) {
            case 0:
                String string = ((Application) this.f5889b).getString(i10);
                AbstractC16544l.m18093f(string, "getString(...)");
                return string;
            default:
                String string2 = ((Resources) this.f5889b).getString(i10);
                AbstractC16544l.m18093f(string2, "getString(...)");
                return string2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m3161c(int i10, Object... objArr) {
        switch (this.f5888a) {
            case 0:
                String string = ((Application) this.f5889b).getString(i10, Arrays.copyOf(objArr, objArr.length));
                AbstractC16544l.m18093f(string, "getString(...)");
                return string;
            default:
                String string2 = ((Resources) this.f5889b).getString(i10, Arrays.copyOf(objArr, objArr.length));
                AbstractC16544l.m18093f(string2, "getString(...)");
                return string2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String[] m3162d(int i10) {
        switch (this.f5888a) {
            case 0:
                String[] stringArray = ((Application) this.f5889b).getResources().getStringArray(i10);
                AbstractC16544l.m18093f(stringArray, "getStringArray(...)");
                return stringArray;
            default:
                String[] stringArray2 = ((Resources) this.f5889b).getStringArray(i10);
                AbstractC16544l.m18093f(stringArray2, "getStringArray(...)");
                return stringArray2;
        }
    }
}
