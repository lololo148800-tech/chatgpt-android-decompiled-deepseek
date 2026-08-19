package p672c3;

import android.os.Build;
import android.widget.RemoteViews;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p884m3.AbstractC17148g;
import p884m3.C17144c;
import p884m3.C17145d;
import p884m3.C17146e;
import p884m3.C17147f;

/* JADX INFO: renamed from: c3.s */
/* JADX INFO: loaded from: classes.dex */
public final class C11629s {

    /* JADX INFO: renamed from: a */
    public static final C11629s f35245a = new C11629s();

    /* JADX INFO: renamed from: a */
    public final void m12999a(RemoteViews remoteViews, int i10, AbstractC17148g abstractC17148g) {
        AbstractC16544l.m18094g(remoteViews, "<this>");
        if (Build.VERSION.SDK_INT < 31) {
            throw new IllegalArgumentException(("setClipToOutline is only available on SDK 31 and higher").toString());
        }
        remoteViews.setBoolean(i10, "setClipToOutline", true);
        if (abstractC17148g instanceof C17144c) {
            remoteViews.setViewOutlinePreferredRadius(i10, ((C17144c) abstractC17148g).f54814a, 1);
        } else {
            throw new IllegalStateException(("Rounded corners should not be " + abstractC17148g.getClass().getCanonicalName()).toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13000b(RemoteViews remoteViews, int i10, AbstractC17148g abstractC17148g) {
        if (abstractC17148g instanceof C17147f) {
            remoteViews.setViewLayoutHeight(i10, -2.0f, 0);
            return;
        }
        if (abstractC17148g instanceof C17145d) {
            remoteViews.setViewLayoutHeight(i10, 0.0f, 0);
        } else if (abstractC17148g instanceof C17144c) {
            remoteViews.setViewLayoutHeight(i10, ((C17144c) abstractC17148g).f54814a, 1);
        } else {
            if (!AbstractC16544l.m18089b(abstractC17148g, C17146e.f54816a)) {
                throw new C0644w();
            }
            remoteViews.setViewLayoutHeight(i10, -1.0f, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13001c(RemoteViews remoteViews, int i10, AbstractC17148g abstractC17148g) {
        if (abstractC17148g instanceof C17147f) {
            remoteViews.setViewLayoutWidth(i10, -2.0f, 0);
            return;
        }
        if (abstractC17148g instanceof C17145d) {
            remoteViews.setViewLayoutWidth(i10, 0.0f, 0);
        } else if (abstractC17148g instanceof C17144c) {
            remoteViews.setViewLayoutWidth(i10, ((C17144c) abstractC17148g).f54814a, 1);
        } else {
            if (!AbstractC16544l.m18089b(abstractC17148g, C17146e.f54816a)) {
                throw new C0644w();
            }
            remoteViews.setViewLayoutWidth(i10, -1.0f, 0);
        }
    }
}
