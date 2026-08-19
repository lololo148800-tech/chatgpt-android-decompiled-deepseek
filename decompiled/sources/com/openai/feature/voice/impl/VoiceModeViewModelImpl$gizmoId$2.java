package com.openai.feature.voice.impl;

import bf.AbstractC11372a0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p1042uh.C20263a0;
import p1082wd.C20908a;
import p1155zi.C21936L0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lzi/L0;", "invoke-f0C5lQk", "()Ljava/lang/String;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeViewModelImpl$gizmoId$2 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ VoiceModeViewModelImpl f40115Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$gizmoId$2(VoiceModeViewModelImpl voiceModeViewModelImpl) {
        super(0);
        this.f40115Y = voiceModeViewModelImpl;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        C20263a0 c20263a0 = ((C20908a) this.f40115Y.f39988o.f50876c.getValue()).f66645a;
        String strM12782a = c20263a0 != null ? AbstractC11372a0.m12782a(c20263a0) : null;
        if (strM12782a != null) {
            return new C21936L0(strM12782a);
        }
        return null;
    }
}
