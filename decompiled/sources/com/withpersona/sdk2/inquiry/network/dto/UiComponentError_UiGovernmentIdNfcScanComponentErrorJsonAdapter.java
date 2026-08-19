package com.withpersona.sdk2.inquiry.network.dto;

import bj.AbstractC11440E;
import bj.AbstractC11452Q;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import dj.AbstractC13178c;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;
import p926of.yRae.sVDIzpC;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R&\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError_UiGovernmentIdNfcScanComponentErrorJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;)V", "Lbj/v;", "options", "Lbj/v;", "stringAdapter", "Lbj/r;", "", "mapOfStringStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UiComponentError_UiGovernmentIdNfcScanComponentErrorJsonAdapter extends AbstractC11471r {
    private volatile Constructor<UiComponentError.UiGovernmentIdNfcScanComponentError> constructorRef;
    private final AbstractC11471r mapOfStringStringAdapter;
    private final C11475v options = C11475v.m12866a(DiagnosticsEntry.NAME_KEY, "type", "message");
    private final AbstractC11471r stringAdapter;

    public UiComponentError_UiGovernmentIdNfcScanComponentErrorJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.stringAdapter = c11447l.m12850b(String.class, c17691y, DiagnosticsEntry.NAME_KEY);
        this.mapOfStringStringAdapter = c11447l.m12850b(AbstractC11452Q.m12856f(Map.class, String.class, String.class), c17691y, "message");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(74, "GeneratedJsonAdapter(UiComponentError.UiGovernmentIdNfcScanComponentError)");
    }

    @Override // bj.AbstractC11471r
    public UiComponentError.UiGovernmentIdNfcScanComponentError fromJson(AbstractC11477x reader) throws NoSuchMethodException {
        reader.mo12814e();
        int i10 = -1;
        String str = null;
        Map map = null;
        String str2 = null;
        while (true) {
            boolean zHasNext = reader.hasNext();
            String str3 = sVDIzpC.OPUFtvoFbwwq;
            if (!zHasNext) {
                reader.mo12818m();
                if (i10 == -3) {
                    if (str == null) {
                        throw AbstractC13178c.m14832f(DiagnosticsEntry.NAME_KEY, DiagnosticsEntry.NAME_KEY, reader);
                    }
                    if (map != null) {
                        return new UiComponentError.UiGovernmentIdNfcScanComponentError(str, str2, map);
                    }
                    throw AbstractC13178c.m14832f(str3, str3, reader);
                }
                Constructor<UiComponentError.UiGovernmentIdNfcScanComponentError> declaredConstructor = this.constructorRef;
                if (declaredConstructor == null) {
                    declaredConstructor = UiComponentError.UiGovernmentIdNfcScanComponentError.class.getDeclaredConstructor(String.class, String.class, Map.class, Integer.TYPE, AbstractC13178c.f41822c);
                    this.constructorRef = declaredConstructor;
                }
                if (str == null) {
                    throw AbstractC13178c.m14832f(DiagnosticsEntry.NAME_KEY, DiagnosticsEntry.NAME_KEY, reader);
                }
                if (map != null) {
                    return declaredConstructor.newInstance(str, str2, map, Integer.valueOf(i10), null);
                }
                throw AbstractC13178c.m14832f(str3, str3, reader);
            }
            int iMo12819v0 = reader.mo12819v0(this.options);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw AbstractC13178c.m14838l(DiagnosticsEntry.NAME_KEY, DiagnosticsEntry.NAME_KEY, reader);
                }
            } else if (iMo12819v0 == 1) {
                str2 = (String) this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw AbstractC13178c.m14838l("type", "type", reader);
                }
                i10 = -3;
            } else if (iMo12819v0 == 2 && (map = (Map) this.mapOfStringStringAdapter.fromJson(reader)) == null) {
                throw AbstractC13178c.m14838l(str3, str3, reader);
            }
        }
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, UiComponentError.UiGovernmentIdNfcScanComponentError value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T(DiagnosticsEntry.NAME_KEY);
        this.stringAdapter.toJson(writer, value_.getName());
        writer.mo12827T("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.mo12827T("message");
        this.mapOfStringStringAdapter.toJson(writer, value_.getMessage());
        writer.mo12823E();
    }
}
