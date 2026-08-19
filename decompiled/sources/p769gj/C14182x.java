package p769gj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p225Im.InterfaceC3756d;
import p396Q4.InterfaceC6571a;
import p544W9.AbstractC8718u;

/* JADX INFO: renamed from: gj.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C14182x implements InterfaceC14147A {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3756d f44575a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1440o f44576b;

    /* JADX INFO: renamed from: c */
    public final Object f44577c;

    public C14182x(InterfaceC3756d type, InterfaceC1440o bindingInflater, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(bindingInflater, "bindingInflater");
        this.f44575a = type;
        this.f44576b = bindingInflater;
        this.f44577c = interfaceC1436k;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [Bm.k, java.lang.Object] */
    @Override // p769gj.InterfaceC14147A
    /* JADX INFO: renamed from: a */
    public final View mo1135a(Object initialRendering, C14183y initialViewEnvironment, Context contextForNewView, ViewGroup viewGroup) {
        Context context;
        AbstractC16544l.m18094g(initialRendering, "initialRendering");
        AbstractC16544l.m18094g(initialViewEnvironment, "initialViewEnvironment");
        AbstractC16544l.m18094g(contextForNewView, "contextForNewView");
        if (viewGroup == null || (context = viewGroup.getContext()) == null) {
            context = contextForNewView;
        }
        LayoutInflater layoutInflaterCloneInContext = LayoutInflater.from(context).cloneInContext(contextForNewView);
        AbstractC16544l.m18093f(layoutInflaterCloneInContext, "contextForNewView.viewBi…LayoutInflater(container)");
        InterfaceC6571a interfaceC6571a = (InterfaceC6571a) this.f44576b.invoke(layoutInflaterCloneInContext, viewGroup, Boolean.FALSE);
        InterfaceC14170l interfaceC14170l = (InterfaceC14170l) this.f44577c.invoke(interfaceC6571a);
        View root = interfaceC6571a.getRoot();
        AbstractC16544l.m18093f(root, "binding.root");
        AbstractC8718u.m9432a(root, initialRendering, initialViewEnvironment, new C14171m(interfaceC14170l, 1));
        View root2 = interfaceC6571a.getRoot();
        AbstractC16544l.m18093f(root2, "bindingInflater(contextF…    }\n      }\n      .root");
        return root2;
    }

    @Override // p769gj.InterfaceC14147A
    public final InterfaceC3756d getType() {
        return this.f44575a;
    }
}
