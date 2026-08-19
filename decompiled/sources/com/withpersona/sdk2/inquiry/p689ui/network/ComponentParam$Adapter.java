package com.withpersona.sdk2.inquiry.p689ui.network;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.InterfaceC11453S;
import bj.InterfaceC11467n;
import java.math.BigDecimal;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p100Dk.AbstractC2082i;
import p100Dk.C2074a;
import p100Dk.C2075b;
import p100Dk.C2076c;
import p100Dk.C2077d;
import p100Dk.C2078e;
import p100Dk.C2079f;
import p100Dk.C2080g;
import p100Dk.C2081h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m18067d2 = {"com/withpersona/sdk2/inquiry/ui/network/ComponentParam$Adapter", "Lbj/r;", "LDk/i;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)LDk/i;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;LDk/i;)V", "ui_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ComponentParam$Adapter extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public static final ComponentParam$Adapter f41015a = new ComponentParam$Adapter();

    @Override // bj.AbstractC11471r
    @InterfaceC11467n
    public AbstractC2082i fromJson(AbstractC11477x reader) {
        AbstractC16544l.m18094g(reader, "reader");
        return null;
    }

    @Override // bj.AbstractC11471r
    @InterfaceC11453S
    public void toJson(AbstractC11440E writer, AbstractC2082i value) {
        AbstractC16544l.m18094g(writer, "writer");
        if (value instanceof C2077d) {
            writer.mo12828V0(((C2077d) value).f6414Y);
            return;
        }
        if (value instanceof C2078e) {
            writer.mo12832a();
            Iterator it = ((C2078e) value).f6415Y.iterator();
            while (it.hasNext()) {
                writer.mo12828V0((String) it.next());
            }
            writer.mo12834m();
            return;
        }
        if (value instanceof C2074a) {
            writer.mo12833e();
            C2074a c2074a = (C2074a) value;
            String str = c2074a.f6407Y;
            if (str != null) {
                writer.mo12827T("street_1");
                writer.mo12828V0(str);
            }
            String str2 = c2074a.f6408Z;
            if (str2 != null) {
                writer.mo12827T("street_2");
                writer.mo12828V0(str2);
            }
            String str3 = c2074a.f6409o0;
            if (str3 != null) {
                writer.mo12827T("city");
                writer.mo12828V0(str3);
            }
            String str4 = c2074a.f6410p0;
            if (str4 != null) {
                writer.mo12827T("subdivision");
                writer.mo12828V0(str4);
            }
            String str5 = c2074a.f6411q0;
            if (str5 != null) {
                writer.mo12827T("postal_code");
                writer.mo12828V0(str5);
            }
            writer.mo12823E();
            return;
        }
        if (value instanceof C2075b) {
            writer.mo12830W0(((C2075b) value).f6412Y);
            return;
        }
        if (value instanceof C2076c) {
            writer.mo12828V0(new BigDecimal(((C2076c) value).f6413Y.doubleValue()).toPlainString());
            return;
        }
        if (value instanceof C2079f) {
            writer.mo12828V0(((C2079f) value).f6416Y);
            return;
        }
        if (value instanceof C2080g) {
            writer.mo12833e();
            C2080g c2080g = (C2080g) value;
            String str6 = c2080g.f6417Y;
            if (str6 != null) {
                writer.mo12827T("dg1");
                writer.mo12828V0(str6);
            }
            String str7 = c2080g.f6418Z;
            if (str7 != null) {
                writer.mo12827T("dg2");
                writer.mo12828V0(str7);
            }
            String str8 = c2080g.f6419o0;
            if (str8 != null) {
                writer.mo12827T("sod");
                writer.mo12828V0(str8);
            }
            writer.mo12823E();
            return;
        }
        if (value instanceof C2081h) {
            writer.mo12833e();
            C2081h c2081h = (C2081h) value;
            String str9 = c2081h.f6420Y;
            if (str9 != null) {
                writer.mo12827T("idb_country");
                writer.mo12828V0(str9);
            }
            String str10 = c2081h.f6421Z;
            if (str10 != null) {
                writer.mo12827T("idb_type");
                writer.mo12828V0(str10);
            }
            String str11 = c2081h.f6422o0;
            if (str11 != null) {
                writer.mo12827T("idb_value");
                writer.mo12828V0(str11);
            }
            writer.mo12823E();
        }
    }
}
