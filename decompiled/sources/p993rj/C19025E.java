package p993rj;

import android.content.Context;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;
import sj.C19661b;
import tj.EnumC19999a;

/* JADX INFO: renamed from: rj.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C19025E {

    /* JADX INFO: renamed from: a */
    public final Context f60642a;

    /* JADX INFO: renamed from: b */
    public final C19661b f60643b;

    /* JADX INFO: renamed from: c */
    public final C19033M f60644c;

    /* JADX INFO: renamed from: d */
    public final Camera2PreviewView f60645d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC19044f f60646e;

    /* JADX INFO: renamed from: f */
    public final EnumC19999a f60647f;

    /* JADX INFO: renamed from: g */
    public final boolean f60648g;

    /* JADX INFO: renamed from: h */
    public int f60649h;

    public C19025E(Context context, C19661b cameraStatsManager, C19033M c19033m, Camera2PreviewView camera2PreviewView, InterfaceC19044f analyzer, EnumC19999a videoCaptureMethod, boolean z6) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(cameraStatsManager, "cameraStatsManager");
        AbstractC16544l.m18094g(analyzer, "analyzer");
        AbstractC16544l.m18094g(videoCaptureMethod, "videoCaptureMethod");
        this.f60642a = context;
        this.f60643b = cameraStatsManager;
        this.f60644c = c19033m;
        this.f60645d = camera2PreviewView;
        this.f60646e = analyzer;
        this.f60647f = videoCaptureMethod;
        this.f60648g = z6;
    }

    /* JADX INFO: renamed from: a */
    public final C19024D m20285a() {
        C19033M c19033m = this.f60644c;
        return new C19024D(this.f60642a, (C19032L) AbstractC17680n.m19361k0(c19033m.f60678b, AbstractC9393x3.m9974d(c19033m.f60677a)).get(this.f60649h), this.f60645d, this.f60646e, this.f60647f, this.f60648g, this.f60643b);
    }
}
