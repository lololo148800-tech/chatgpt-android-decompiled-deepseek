package com.withpersona.sdk2.inquiry.governmentid.capture_tips;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p003A1.AbstractC0168G;
import p1156zj.EnumC22128V0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/capture_tips/CaptureTipsViewModel;", "", "government-id_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class CaptureTipsViewModel {

    /* JADX INFO: renamed from: a */
    public final String f40613a;

    /* JADX INFO: renamed from: b */
    public final String f40614b;

    /* JADX INFO: renamed from: c */
    public final String f40615c;

    /* JADX INFO: renamed from: d */
    public final String f40616d;

    /* JADX INFO: renamed from: e */
    public final String f40617e;

    /* JADX INFO: renamed from: f */
    public final EnumC22128V0 f40618f;

    public CaptureTipsViewModel(String helpButtonText, String title, String prompt, String tips, String buttonText, EnumC22128V0 side) {
        AbstractC16544l.m18094g(helpButtonText, "helpButtonText");
        AbstractC16544l.m18094g(title, "title");
        AbstractC16544l.m18094g(prompt, "prompt");
        AbstractC16544l.m18094g(tips, "tips");
        AbstractC16544l.m18094g(buttonText, "buttonText");
        AbstractC16544l.m18094g(side, "side");
        this.f40613a = helpButtonText;
        this.f40614b = title;
        this.f40615c = prompt;
        this.f40616d = tips;
        this.f40617e = buttonText;
        this.f40618f = side;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptureTipsViewModel)) {
            return false;
        }
        CaptureTipsViewModel captureTipsViewModel = (CaptureTipsViewModel) obj;
        return AbstractC16544l.m18089b(this.f40613a, captureTipsViewModel.f40613a) && AbstractC16544l.m18089b(this.f40614b, captureTipsViewModel.f40614b) && AbstractC16544l.m18089b(this.f40615c, captureTipsViewModel.f40615c) && AbstractC16544l.m18089b(this.f40616d, captureTipsViewModel.f40616d) && AbstractC16544l.m18089b(this.f40617e, captureTipsViewModel.f40617e) && this.f40618f == captureTipsViewModel.f40618f;
    }

    public final int hashCode() {
        return this.f40618f.hashCode() + AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(AbstractC0168G.m527p(this.f40613a.hashCode() * 31, 31, this.f40614b), 31, this.f40615c), 31, this.f40616d), 31, this.f40617e);
    }

    public final String toString() {
        return "CaptureTipsViewModel(helpButtonText=" + this.f40613a + ", title=" + this.f40614b + ", prompt=" + this.f40615c + ", tips=" + this.f40616d + ", buttonText=" + this.f40617e + ", side=" + this.f40618f + Separators.RPAREN;
    }
}
