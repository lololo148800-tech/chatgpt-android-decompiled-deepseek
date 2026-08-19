package p247Jj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p046Bk.C1361Y;
import p225Im.InterfaceC3756d;
import p544W9.AbstractC8718u;
import p769gj.C14171m;
import p769gj.C14183y;
import p769gj.InterfaceC14147A;
import p769gj.InterfaceC14170l;
import p838jj.C16224e;

/* JADX INFO: renamed from: Jj.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C4406S implements InterfaceC14147A {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14300a;

    /* JADX INFO: renamed from: b */
    public final Object f14301b;

    public C4406S(InterfaceC3756d type) {
        this.f14300a = 1;
        C4403Q c4403q = C4403Q.f14291Y;
        AbstractC16544l.m18094g(type, "type");
        this.f14301b = type;
    }

    @Override // p769gj.InterfaceC14147A
    /* JADX INFO: renamed from: a */
    public final View mo1135a(Object initialRendering, C14183y initialViewEnvironment, Context context, ViewGroup viewGroup) {
        Context context2;
        switch (this.f14300a) {
            case 0:
                C4449p0 initialRendering2 = (C4449p0) initialRendering;
                AbstractC16544l.m18094g(initialRendering2, "initialRendering");
                AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
                return ((C4406S) this.f14301b).mo1135a(initialRendering2, initialViewEnvironment, context, viewGroup);
            case 1:
                AbstractC16544l.m18094g(initialRendering, "initialRendering");
                AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
                if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
                    context2 = context;
                }
                View view = LayoutInflater.from(context2).cloneInContext(context).inflate(R.layout.pi2_inquiry_initializing, viewGroup, false);
                AbstractC16544l.m18093f(view, "view");
                AbstractC8718u.m9432a(view, initialRendering, initialViewEnvironment, new C14171m((InterfaceC14170l) C4403Q.f14291Y.invoke(view), 0));
                return view;
            default:
                C16224e initialRendering3 = (C16224e) initialRendering;
                AbstractC16544l.m18094g(initialRendering3, "initialRendering");
                AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
                C1361Y c1361y = (C1361Y) this.f14301b;
                c1361y.getClass();
                return c1361y.f3609b.mo1135a(initialRendering3, initialViewEnvironment, context, viewGroup);
        }
    }

    @Override // p769gj.InterfaceC14147A
    public final InterfaceC3756d getType() {
        switch (this.f14300a) {
            case 0:
                return (InterfaceC3756d) ((C4406S) this.f14301b).f14301b;
            case 1:
                return (InterfaceC3756d) this.f14301b;
            default:
                return ((C1361Y) this.f14301b).f3609b.f44545a;
        }
    }

    public C4406S(int i10) {
        this.f14300a = i10;
        switch (i10) {
            case 2:
                this.f14301b = new C1361Y(4);
                break;
            default:
                C4403Q c4403q = C4403Q.f14291Y;
                this.f14301b = new C4406S(AbstractC16526C.f51263a.mo5693b(C4449p0.class));
                break;
        }
    }
}
