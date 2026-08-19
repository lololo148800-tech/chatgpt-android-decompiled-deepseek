package com.openai.feature.reporting.impl;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sg.C19575q;
import sg.EnumC19541E;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18067d2 = {"impl_release"}, m18068k = 2, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class ReportingViewModelImplKt {

    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39399a;

        static {
            int[] iArr = new int[EnumC19541E.values().length];
            try {
                EnumC19541E enumC19541E = EnumC19541E.f62077Y;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC19541E enumC19541E2 = EnumC19541E.f62077Y;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC19541E enumC19541E3 = EnumC19541E.f62077Y;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39399a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m14343a(C19575q c19575q, EnumC19541E enumC19541E) {
        String str;
        int i10 = enumC19541E == null ? -1 : WhenMappings.f39399a[enumC19541E.ordinal()];
        if (i10 == 1) {
            str = c19575q.f62162a;
            if (str == null) {
                return null;
            }
        } else if (i10 == 2) {
            str = c19575q.f62163b;
            if (str == null) {
                return null;
            }
        } else if (i10 != 3 || (str = c19575q.f62164c) == null) {
            return null;
        }
        return str;
    }
}
